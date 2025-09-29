$(document).ready(function () {
    $("#buttonins").click(function () {
        item = $("#caixadeform").val()
        $("#lista").append('<li>' +item+'</li>')

    })
})