import com.dyq.datamind.comps.textarea.RichFuncTextArea
import com.dyq.datamind.service.Funct
import javafx.geometry.Insets
import javafx.scene.control.Button
import javafx.scene.layout.BorderPane
import javafx.scene.layout.HBox

@Funct(value = "script", func = "TestNewFunc1")
class TestNewFunc1 extends BorderPane {

    TestNewFunc1() {
        def hbox = new HBox()
        hbox.setSpacing(10)
        hbox.setPadding(new Insets(5, 5, 5, 5))
        hbox.getChildren().add(new MyBtn1("222222"))
        setTop(hbox)
        setCenter(RichFuncTextArea.create(""))
    }
}

class MyBtn1 extends Button {
    public MyBtn1(String t) {
        super(t)
    }
}
