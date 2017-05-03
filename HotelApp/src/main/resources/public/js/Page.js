var url = "/api/page";
$.get(url, function(result) {

    $("#title").text(result.title);
    $("#content").text(result.content);
});
