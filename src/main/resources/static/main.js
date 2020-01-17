$('document').ready(function(){
    $('.table .btn-warning').on('click',function(event){

        event.preventDefault();

        const href = $(this).attr('href');

        $.get(href, function (item, status) {
            $('#idEdit').val(item.id);
            $('#nameEdit').val(item.name);
            $('#priceEdit').val(item.price);
            $('#quantityEdit').val(item.quantity);
            $('#deliveryEdit').val(item.delivery);

        });

        $('#editModal').modal();
    });

    $('.table #deleteButton').on('click', function(event){
        event.preventDefault();
        const href= $(this).attr('href');
        $('#deleteModel #delRef').attr('href', href);
        $('#deleteModel').modal();
    });
});