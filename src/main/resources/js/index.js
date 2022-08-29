// 柱状图模块1
(function() {
	// 1.实例化对象
	var myChart = echarts.init(document.querySelector(".bar .chart"));
	// 2.指定配置项和数据
	var option = {
		color: ["#1bf2fa"],
		tooltip: {
			trigger: 'axis',
			axisPointer: {
				type: 'shadow'
			}
		},
		// 修改图表的大小
		grid: {
			left: '0%',
			top: '10px',
			right: '0%',
			bottom: '0%',
			containLabel: true
		},
		xAxis: [{
			type: 'category',
			axisTick: {
				alignWithLabel: true
			},
			// 数据
			data: ['炒菜', '快餐便当', '饺子馄饨', '米粉面馆', '包子粥店', '夹馍饼类', '麻辣香锅', '火锅串串', '炸卤小吃', '滋补炖汤', '轻食沙拉', '汉堡炸鸡', '能量西餐', '东南亚菜', '日韩料理', '龙虾烧烤', '奶茶果汁', '咖啡烘焙', '美味果蔬', '其他'],
			// 修改刻度标签样式
			axisLabel: {
				// 刻度文字样式
				color: "rgba(255,255,255,0.8)",
				fontSize: "12rpx"
			},
			// x轴样式不显示
			axisLine: {
				show: false
			},
			// x轴文字每行显示1个字（可换行）
			axisLabel: {
				show: true,
				interval: 0, //使x轴上的文字显示完全,
				//设置一行显示几个字,自己设置
				formatter: function(params) {
					var newParamsName = "";
					var paramsNameNumber = params.length;
					var provideNumber = 1; // 每行显示1个字
					var rowNumber = Math.ceil(paramsNameNumber / provideNumber);
					if (paramsNameNumber > provideNumber) {
						for (var p = 0; p < rowNumber; p++) {
							var tempStr = "";
							var start = p * provideNumber;
							var end = start + provideNumber;
							if (p == rowNumber - 1) {
								tempStr = params.substring(start, paramsNameNumber);
							} else {
								tempStr = params.substring(start, end) + "\n";
							}
							newParamsName += tempStr;
						}
					} else {
						newParamsName = params;
					}
					return newParamsName;
				}
			}
		}],
		yAxis: [{
			type: 'value',
			// 修改刻度标签样式
			axisLabel: {
				// 刻度文字样式
				color: "rgba(255,255,255,0.8)",
				fontSize: "12rpx"
			},
			// 设置 y轴线的样式
			axisLine: {
				llineStyle: {
					color: "rgba(255,255,255,0.1)",
					width: 2
				}
			},
			// y轴分割线的样式
			splitLine: {
				lineStyle: {
					color: "rgba(255,255,255,0.1)"
				}
			}
		}],
		series: [{
			name: 'Direct',
			type: 'bar',
			barWidth: '60%',
			itemStyle: {
				// 修改柱子圆角
				barBorderRadius: 1
			},
			data: [10, 52, 200, 334, 390, 330, 220, 420, 321, 123, 233, 322, 100, 152, 121, 41, 253,
				145, 142, 250
			]
		}]
	};
	// 3.把配置项给实例对象
	myChart.setOption(option);
	// 4.让图表跟随屏幕自适应
	window.addEventListener('resize', function() {
		myChart.resize();
	});
})();


// 折线图1模块制作
(function() {
	var yearData = [{
			year: "2021", // 年份
			data: [120, 132, 101, 134, 90, 230, 210, 123, 233, 51, 120, 250]
		},
		{
			year: "2022", // 年份
			data: [321, 102, 243, 123, 175, 258, 169, 145, 233, 321, 320, 152]
		}
	];
	// 1.实例化对象
	var myChart = echarts.init(document.querySelector(".line .chart"));
	// 2.指定配置
	var option = {
		color: ["#1bf2fa"],
		tooltip: {
			trigger: 'axis'
		},
		legend: {
			data: ['新增用户'],
			right: '5%',
			textStyle: {
				color: '#1bf2fa'
			}
		},
		grid: {
			left: '0%',
			top: '25rpx',
			right: '0%',
			bottom: '0%',
			containLabel: true, // 包含刻度文字在内
			show: true, // 显示边框
			borderColor: '#012f4a' // 边框颜色
		},
		xAxis: {
			type: 'category',
			axisTick: {
				alignWithLabel: true
			},
			// 修改刻度标签样式
			axisLabel: {
				// 刻度文字样式
				color: "rgba(255,255,255,0.8)",
				fontSize: "12rpx"
			},
			// x轴样式不显示
			axisLine: {
				show: false
			},
			// x轴文字倾斜显示
			axisLabel: {
				interval: 0,
				rotate: 40
			},
			// 数据
			data: ['1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月', '10月', '11月', '12月']
		},
		yAxis: {
			type: 'value',
			// 修改刻度标签样式
			axisLabel: {
				// 刻度文字样式
				color: "rgba(255,255,255,0.8)",
				fontSize: "12rpx"
			},
			// 设置 y轴线的样式
			axisLine: {
				llineStyle: {
					color: "rgba(255,255,255,0.1)",
					width: 2
				}
			},
			// y轴分割线的样式
			splitLine: {
				lineStyle: {
					color: "rgba(255,255,255,0.1)"
				}
			}
		},
		series: [{
			name: '新增用户',
			type: 'line',
			stack: 'Total',
			data: yearData[1].data
		}]
	};
	// 3.把配置给实例对象
	myChart.setOption(option);
	// 4.让图表跟随屏幕自适应
	window.addEventListener('resize', function() {
		myChart.resize();
	});

	// 5.点击切换效果
	$(".line h2").on("click", "a", function() {
		// 点击a之后根据当前a的索引号 找到对应的 yearData的相关对象
		var obj = yearData[$(this).index()];
		option.series[0].data = obj.data;
		// 需要重新渲染
		myChart.setOption(option);
	});
})();

// 折线图2模块制作
(function() {
	var myChart = echarts.init(document.querySelector('.line2 .chart'));
	option = {
		tooltip: {
			trigger: 'axis'
		},
		legend: {
			top: "0%",
			data: ['完成单', '取消单/退单'],
			textStyle: {
				color: "rgba(255,255,255,0.8)",
				fontSize: "12rpx"
			}
		},
		grid: {
			left: '0%',
			top: '25rpx',
			right: '0%',
			bottom: '0%',
			containLabel: true, // 包含刻度文字在内
			show: true, // 显示边框
			borderColor: '#012f4a' // 边框颜色
		},
		xAxis: [{
			type: 'category',
			axisTick: {
				alignWithLabel: true
			},
			// 修改刻度标签样式
			axisLabel: {
				textStyle: {
					color: "rgba(255,255,255,0.8)",
					fontSize: "12rpx"
				}
			},
			// x轴样式不显示
			axisLine: {
				show: false,
				color: "rgba(255,255,255,0.2)"
			},
			// x轴文字倾斜显示
			axisLabel: {
				interval: 0,
				rotate: 40
			},
			// 数据
			data: ['1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月', '10月', '11月', '12月']
		}],
		yAxis: [{
			type: 'value',
			// 修改刻度标签样式
			axisTick: {
				show: false
			},
			axisLabel: {
				// 刻度文字样式
				color: "rgba(255,255,255,0.8)",
				fontSize: "12rpx"
			},
			// 设置 y轴线的样式
			axisLine: {
				llineStyle: {
					color: "rgba(255,255,255,0.1)",
					width: 2
				}
			},
			// y轴分割线的样式
			splitLine: {
				lineStyle: {
					color: "rgba(255,255,255,0.1)"
				}
			}
		}],
		series: [{
				name: '完成单',
				type: 'line',
				smooth: true, // 线条变圆滑
				// 单独修改线条样式
				lineStyle: {
					color: "#0184d5",
					width: "2"
				},
				// 填充区域
				areaStyle: {
					// 渐变色
					color: new echarts.graphic.LinearGradient(
						0,
						0,
						0,
						1,
						[{
								offset: 0,
								color: "rgba(1, 132, 213, 0.4)"
							},
							{
								offset: 0.8,
								color: "rgba(1, 132, 213, 0.1)"
							}
						],
						false
					),
					shadowColor: "rgba(0, 0, 0, 0.1)"
				},
				// 设置拐点
				symbol: "circle",
				// 拐点大小
				symbolSize: 8,
				// 开始不显示拐点
				showSymbol: false,
				itemStyle: {
					color: "#0184d5",
					borderColor: "rgba(221, 220, 107, 0.1)",
					borderWidth: 12
				},
				emphasis: {
					focus: 'series'
				},
				data: [120, 132, 101, 134, 90, 230, 210, 321, 233, 145, 301, 122]
			},
			// 第二条线
			{
				name: '取消单/退单',
				type: 'line',
				smooth: true,
				lineStyle: {
					normal: {
						color: "#1bf2fa",
						width: 2
					}
				},
				areaStyle: {
					color: new echarts.graphic.LinearGradient(
						0,
						0,
						0,
						1,
						[{
								offset: 0,
								color: "rgba(26, 238, 244, 0.4)"
							},
							{
								offset: 0.8,
								color: "rgba(0, 216, 135, 0.1)"
							}
						],
						false
					),
					shadowColor: "rgba(0, 0, 0, 0.1)"
				},
				// 设置拐点
				symbol: "circle",
				// 拐点大小
				symbolSize: 8,
				// 开始不显示拐点
				showSymbol: false,
				itemStyle: {
					color: "#1bf2fa",
					borderColor: "rgba(221, 220, 107, 0.1)",
					borderWidth: 12
				},
				emphasis: {
					focus: 'series'
				},
				data: [220, 182, 191, 234, 290, 330, 310, 233, 156, 148, 452, 120]
			}
		]
	};
	myChart.setOption(option);
	// 4.让图表跟随屏幕自适应
	window.addEventListener('resize', function() {
		myChart.resize();
	});
})();


// 饼图 店铺地区分布模块
(function() {
	var myChart = echarts.init(document.querySelector('.pie .chart'));
	var option = {
		legend: {
		  top: "90%",
		  itemWidth: 10,
		  itemHeight: 10,
		  textStyle: {
		    color: "rgba(255,255,255,.5)",
		    fontSize: "12"
		  }
		},
		tooltip: {
		  trigger: "item",
		  formatter: "{a} <br/>{b} : {c} ({d}%)"
		},
		// 注意颜色写的位置
		color: [
		  "#ff0000",
		  "#ff7f00",
		  "#ffff00",
		  "#00ff00",
		  "#1bf2fa",
		  "#0000ff",
		  "#8b00ff",
		  "#ffffff",
		  "#ffc4df"
		],
		series: [
		  {
		    name: "店铺地区分布",
		    type: "pie",
		    // 如果radius是百分比则必须加引号
		    radius: ["10%", "70%"],
		    center: ["50%", "42%"],
			// 半径模式
		    roseType: "radius",
		    data: [
		      { value: 42, name: "福建" },
		      { value: 26, name: "北京" },
		      { value: 12, name: "山东" },
		      { value: 15, name: "河北" },
		      { value: 20, name: "江苏" },
		      { value: 25, name: "浙江" },
		      { value: 23, name: "天津" },
		      { value: 30, name: "广东" },
		      { value: 33, name: "上海" }
		    ],
		    // 修饰饼形图文字相关的样式 label对象
		    label: {
		      fontSize: 10
		    },
		    // 修饰引导线样式
		    labelLine: {
		      // 连接到图形的线长度
		      length: 10,
		      // 连接到文字的线长度
		      length2: 10
		    }
		  }
		]
	};
	// 3.把配置给实例对象
	myChart.setOption(option);
	// 4.让图表跟随屏幕自适应
	window.addEventListener('resize', function() {
		myChart.resize();
	});
})();
