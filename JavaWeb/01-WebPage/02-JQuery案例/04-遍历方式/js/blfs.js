/*
js遍历的方式			for(初始化值;循环结束条件;步进){}
jq遍历方式1			jq对象.each(callback)
jq遍历方式2			$.each(object,[callback])
jq遍历方式3			for...of;
*/
$(function () {

    /*第1.1种方式*/
    /*var citys = $("#city li");
    for (var i = 0; i < citys.length; i++) {
        alert(i+":"+citys[i].innerHTML)
    }*/

    /*第1.2种方式*/
    /*var citys = $("#city li");
    citys.each(function () {
        alert(this.innerHTML)

    })*/

    /*第1.3种方式*/
    /*var citys = $("#city li");
    citys.each(function (index,element) {
        alert(index+":"+element.innerHTML)
    })*/

    /*第1.4种方式*/
    /*var citys = $("#city li");
    citys.each(function (index,element) {
        alert(index+":"+$(element).html())
    })*/

    /*第2.1种方式*/
    /*var citys = $("#city li");
    $.each(citys,function () {
        alert(this.innerHTML)
    })*/

    /*第2.2种方式*/
    /*var citys = $("#city li");
    $.each(citys,function (index,element) {
        alert(index+":"+element.innerHTML)
    })*/

    /*第3.1种方式*/
    var citys = $("#city li");
    for(element of citys){
        alert(element.innerHTML)
    }


})