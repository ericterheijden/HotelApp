var url = "/api/page";

function processResult(result) {
        $("#title").text(result.title);
        $("#content").text(result.content);
        console.log("klaar met verwerken");
}

$.get(url, processResult);
console.log("hoi");