/*获取按钮并添加单击事件*/
document.getElementById("btn-add").onclick = function () {

    /*获取文本框输入输入的内容*/
    var id = document.getElementById("id");
    var valueId = id.value;

    var name = document.getElementById("name");
    var valueName = name.value;

    var gender = document.getElementById("gender");
    var valueGender = gender.value;

    /*创建td标签,创建文本节点并添加相应内容,将文本节点添加到td中*/
    var tdId = document.createElement("td");
    var textId = document.createTextNode(valueId);
    tdId.appendChild(textId)

    var tdName = document.createElement("td");
    var textName = document.createTextNode(valueName);
    tdName.appendChild(textName)

    var tdGender = document.createElement("td");
    var textGender = document.createTextNode(valueGender);
    tdGender.appendChild(textGender)

    var td_a = document.createElement("td");
    var ele_a = document.createElement("a");
    ele_a.setAttribute("href","javascript:void(0);")
    ele_a.setAttribute("onclick","delTr(this);")
    var text_a = document.createTextNode("删除");
    ele_a.appendChild(text_a)
    td_a.appendChild(ele_a)

    /*创建tr*/
    var tr = document.createElement("tr");

    /*添加td到tr中*/
    tr.appendChild(tdId)
    tr.appendChild(tdName)
    tr.appendChild(tdGender)
    tr.appendChild(td_a)

    /*将tr添加到table中*/
    var table = document.getElementsByTagName("table")[0];
    table.appendChild(tr)
}

/*删除*/
function delTr(obj) {
    var table = obj.parentNode.parentNode.parentNode;
    var tr = obj.parentNode.parentNode;
    table.removeChild(tr)
}