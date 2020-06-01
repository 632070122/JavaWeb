window.onload = function () {

    /*全部选择*/
    document.getElementById("selectAll").onclick = function () {
        var cds = document.getElementsByName("cd");
        for (var i = 0; i < cds.length; i++) {
            cds[i].checked = true;
        }
    }

    /*全部不选择*/
    document.getElementById("unSelectAll").onclick = function () {
        var cds = document.getElementsByName("cd");
        for (var i = 0; i < cds.length; i++) {
            cds[i].checked = false;
        }
    }

    /*反选*/
    document.getElementById("selectRev").onclick = function () {
        var cds = document.getElementsByName("cd");
        for (var i = 0; i < cds.length; i++) {
            cds[i].checked = !cds[i].checked;
        }
    }

    /*选择第一个,全部选择,全部取消*/
    document.getElementById("firstCb").onclick = function () {
        var cds = document.getElementsByName("cd");
        for (var i = 0; i < cds.length; i++) {
            cds[i].checked = this.checked;
        }
    }

    /*颜色变色事件*/
    var trs = document.getElementsByTagName("tr");
    for (var i = 0; i < trs.length; i++) {
        trs[i].onmouseover = function () {
            this.style.backgroundColor = "pink"
            /*this.className = "over";*/
        }
        trs[i].onmouseout = function () {
            this.style.backgroundColor = "white"
            /*this.className = "out";*/
        }
    }
}