<%@ page pageEncoding="utf-8" %>
<html>
<head>
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
    <script src="http://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script src="//tinymce.cachefly.net/4.0/tinymce.min.js"></script>
    <script>
        tinymce.init({
            selector:'textarea',
            width:800,
            height: 300,
            statusbar : false
        });

        $(document).ready(function() {
            var radioButtonsMap = {
                'sukienka': ['sizeA', 'sizeB', 'sizeC', 'sizeD', 'sizeE', 'sizeF'],
                'bluzka': ['sizeA', 'sizeB', 'sizeC', 'sizeD'],
                'spodnie': ['sizeA', 'sizeB', 'sizeC'],
                'spodnica': ['sizeA', 'sizeB', 'sizeC', 'sizeD']
            };

            function hideSizes() {
                $('#sizes').find('.size').hide();
                $('#sizes').find('input').val("");
            }

            hideSizes();

            $('#form').submit(function() {
                $('#content').val(tinyMCE.activeEditor.getContent());
                return true;
            });

            $('.schemaRadio').on('change', function() {
                hideSizes();
                var arrayOfButtons = radioButtonsMap[$(this).val()];
                $.each(arrayOfButtons, function(key, val) {
                    $('#' + val).show();
                })
            })
        });
    </script>
    <style>
        .schema > input[type=radio]{
            display:none;
        }
        input[type=radio] + img {
            cursor:pointer;
            border:2px solid transparent;
        }
        input[type=radio]:checked + img{
            border:2px solid #f00;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Lista aukcji</a>
        <a class="navbar-brand" href="#">Dodaj aukcję</a>
    </div>
</nav>

<div class="container">
    <div class="col-md-9 col-md-offset-1">

        <form id="form" action="generateAuction" role="form" method="POST" enctype="multipart/form-data">

            <div class="panel panel-primary">
                <div class="panel-heading">
                    Typ odzieży
                </div>
                <div class="panel-body">
                    <label class="schema" for="sukienka">
                        <input id="sukienka" type="radio" class="schemaRadio" name="schema" value="sukienka"/>
                        <img src="http://i.imgur.com/V6ykl6K.jpg"/>
                    </label>
                    <label class="schema" for="bluzka">
                        <input id="bluzka" type="radio" class="schemaRadio" name="schema" value="bluzka"/>
                        <img src="http://i.imgur.com/FXFuvuC.jpg"/>
                    </label>
                    <label class="schema" for="spodnie">
                        <input id="spodnie" type="radio" class="schemaRadio" name="schema" value="spodnie"/>
                        <img src="http://i.imgur.com/YkOE3SS.jpg"/>
                    </label>
                    <label class="schema" for="spodnica">
                        <input id="spodnica" type="radio" class="schemaRadio" name="schema" value="spodnica"/>
                        <img src="http://i.imgur.com/XIGry97.jpg"/>
                    </label>

                    <div class="form-group" id="sizes">
                        <div class="form-group size" id="sizeA">
                            <label for="a" class="col-sm-2 control-label">A:</label>
                            <div class="col-sm-10">
                                <input type="text" name="sizeA" class="form-control" id="a">
                            </div>
                        </div>
                        <div class="form-group size" id="sizeB">
                            <label for="b" class="col-sm-2 control-label">B:</label>
                            <div class="col-sm-10">
                                <input type="text" name="sizeB" class="form-control" id="b">
                            </div>
                        </div>
                        <div class="form-group size" id="sizeC">
                            <label for="c" class="col-sm-2 control-label">C:</label>
                            <div class="col-sm-10">
                                <input type="text" name="sizeC" class="form-control" id="c">
                            </div>
                        </div>
                        <div class="form-group size" id="sizeD">
                            <label for="d" class="col-sm-2 control-label">D:</label>
                            <div class="col-sm-10">
                                <input type="text" name="sizeD" class="form-control" id="d">
                            </div>
                        </div>
                        <div class="form-group size" id="sizeE">
                            <label for="e" class="col-sm-2 control-label">E:</label>
                            <div class="col-sm-10">
                                <input type="text" name="sizeE" class="form-control" id="e">
                            </div>
                        </div>
                        <div class="form-group size" id="sizeF">
                            <label for="f" class="col-sm-2 control-label">F:</label>
                            <div class="col-sm-10">
                                <input type="text" name="sizeF" class="form-control" id="f">
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="panel panel-primary">
                <div class="panel-heading">
                    Zdjęcia
                </div>
                <div class="panel-body">
                    <div class="form-group">
                        <label>
                            Zdjęcie 1:
                            <input type="file" name="file1" accept="image/*">
                        </label>
                    </div>
                    <div class="form-group">
                        <label>
                            Zdjęcie 2:
                            <input type="file" name="file2" accept="image/*">
                        </label>
                    </div>
                    <div class="form-group">
                        <label>
                            Zdjęcie 3:
                            <input type="file" name="file3" accept="image/*">
                        </label>
                    </div>
                    <div class="form-group">
                        <label>
                            Zdjęcie 4:
                            <input type="file" name="file4" accept="image/*">
                        </label>
                    </div>
                    <div class="form-group">
                        <label>
                            Zdjęcie 5:
                            <input type="file" name="file5" accept="image/*">
                        </label>
                    </div>
                </div>
            </div>

            <div class="panel panel-primary">
                <div class="panel-heading">
                    Zawartość
                </div>
                <div class="panel-body">
                    <div class="form-group">
                        <textarea id="tinyMce"></textarea>
                        <input type="hidden" name="content" id="content" />
                    </div>
                </div>
            </div>

            <div class="form-group">
                <input type="submit" class="btn btn-primary" value="Wyślij">
            </div>

        </form>
    </div>
</div>

</body>
</html>
