import com.dyq.datamind.comps.textarea.RichFuncTextArea
import com.dyq.datamind.service.Funct
import javafx.geometry.Insets
import javafx.scene.control.Button
import javafx.scene.layout.BorderPane
import javafx.scene.layout.HBox

@Funct(func = "DiseaseToGeneCollect")
class DiseaseToGeneCollect extends BorderPane {

    DiseaseToGeneCollect() {
        def hbox = new HBox()
        hbox.setSpacing(10)
        hbox.setPadding(new Insets(5, 5, 5, 5))
        hbox.getChildren().add(new MyBtn("Test"))
        setTop(hbox)
        setCenter(RichFuncTextArea.create(""))
    }
}

class MyBtn extends Button {
    public MyBtn(String t) {
        super(t)
    }
}
