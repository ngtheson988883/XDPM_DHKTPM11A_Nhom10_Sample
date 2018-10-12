package iuh.se.dhktpm11a.controller;

import iuh.se.dhktpm11a.config.StageManager;
import iuh.se.dhktpm11a.helper.View;
import iuh.se.dhktpm11a.model.service.DiaService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

@Controller
public class SampleController {

    @FXML
    Button btn_showAllDia;

    @FXML
    TextArea ta_diaList;

    @Autowired
    DiaService diaService;

    @Lazy
    @Autowired
    StageManager stageManager;

    public void showAllDia(ActionEvent actionEvent) {
        diaService.findAllDia().forEach(dia -> {
            System.out.println(dia);
            ta_diaList.appendText(dia.toString());
            ta_diaList.appendText("\n");
        });
    }

    public void changeView(ActionEvent actionEvent) {
        stageManager.switchScene(View.SAMPLE_SECOND);
    }
}
