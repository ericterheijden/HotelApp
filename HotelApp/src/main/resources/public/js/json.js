$("#submit").click(function(e){
    e.preventDefault();

    var formData = {number:42};
    var formData = {number:$("#jsonNo").val()};

    $.ajax(
        {
            contentType: "application/json",
            url: "/api/json",
            type: "POST",
            data: JSON.stringify(formData),
            success: function(result){
                // data server
                console.log(result);
                var resultToShow = result.loc + " - " + result.age + " - " + result.name;

                $("#result").append(resultToShow);
            },
            error: function(jqXHR, textStatus, errorThrown){

                //
            }
        }
    )

}

)
