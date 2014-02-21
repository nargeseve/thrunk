<%@include file="init.jsp"%>
<div class="footer-panel">
    <fa:message key="copyright"/>
</div>

<script type="text/javascript">
    $(document).ready(function(){
        $('.main-menu').puimenubar();
        $('.main-menu').parent().puisticky();
        $('.right-panel').puipanel();
        $('.main-panel').puipanel();
        $('.footer-panel').puipanel();
    });
</script>
