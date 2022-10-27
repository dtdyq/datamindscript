import com.dyq.datamind.comps.textarea.RichFuncTextArea
import com.dyq.datamind.service.Funct
import com.dyq.datamind.view.GlobalInst
import javafx.collections.FXCollections
import javafx.geometry.Insets
import javafx.scene.control.Button
import javafx.scene.control.ComboBox
import javafx.scene.control.TextField
import javafx.scene.layout.BorderPane
import javafx.scene.layout.HBox

@Funct(func = "DiseaseToGeneCollect")
class DiseaseToGeneCollect extends BorderPane {

    def search = new TextField()
    def combox = new ComboBox(FXCollections.observableArrayList("OMIM", "GeneCard", "ALL", "DrugBank"))
    def obtainBtn = new Button(" GO ")

    DiseaseToGeneCollect() {
        def hbox = new HBox()
        hbox.setSpacing(10)
        hbox.setPadding(new Insets(5, 5, 5, 5))

        search.prefWidthProperty().bind(GlobalInst.sceneWidth * 0.7)

        hbox.getChildren().addAll(search, combox, obtainBtn)
        setTop(hbox)
        
        setCenter(RichFuncTextArea.create(""))
    }
}

class MyBtn extends Button {
    public MyBtn(String t) {
        super(t)
    }
}
