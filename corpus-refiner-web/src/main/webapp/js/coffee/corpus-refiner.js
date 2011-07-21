(function() {
  var NerPanel, nerPanel;
  NerPanel = (function() {
    function NerPanel(id) {
      this.id = id;
    }
    NerPanel.prototype.add = function(lines) {
      return console.log(lines);
    };
    return NerPanel;
  })();
  nerPanel = new NerPanel("nerPanel");
  $(document).ready(function() {
    return $('#logPanel').click(function() {
      return show_message("you");
    });
  });
}).call(this);
