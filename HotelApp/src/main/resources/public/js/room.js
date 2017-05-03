var url = "/api/rooms";
var url2 = "api/rooms/getAll"
function processRoom(result){
    $("#room").text(result.number);
    $("#type").text(result.type);
    $("#price").text(result.price);
}
$.get(url, processRoom);

function allRooms(result){

    for(var i = 0; i < result.length; i++) {
        $("#allrooms").append(result[i].price + "<br>");
    }



}
$.get(url2,allRooms );