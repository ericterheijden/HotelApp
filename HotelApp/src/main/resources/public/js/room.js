var url = "/api/rooms";

function processRoom(result){
    $("#room").text(result.number);
    $("#type").text(result.type);
    $("#price").text(result.price);
}
$.get(url, processRoom);