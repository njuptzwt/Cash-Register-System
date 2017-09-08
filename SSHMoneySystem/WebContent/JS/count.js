$(document).ready(function(){
//获得文本框对象
var t = $("#text_box");
var p = $("#totalprice");
p.attr('disabled',"true");
var c = $("#total");
c.attr('disabled',"true");
var s=$("#price");
s.attr('disabled',"true");
//初始化数量为1,并失效减
$('#min').attr('disabled',true);
 //数量增加操作
 $("#add").click(function(){ 
  // 给获取的val加上绝对值，避免出现负数
  t.val(Math.abs(parseInt(t.val()))+1);
  p.val(Math.abs(parseFloat(t.val()*s.val())));
  c.val(Math.abs(parseInt(c.val()))-1);
  if (parseFloat(t.val())!=1){
  $('#min').attr('disabled',false);
  };
 }) 
 //数量减少操作
 $("#min").click(function(){
 t.val(Math.abs(parseInt(t.val()))-1);
 p.val(Math.abs(parseFloat(t.val()*s.val())));
 c.val(Math.abs(parseInt(c.val()))+1);
 if (parseFloat(t.val())==1){
 $('#min').attr('disabled',true);
 };
 })
});