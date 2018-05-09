package com.github.jaccek.imagerj

import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.VBox
import javafx.stage.FileChooser
import tornadofx.View


class MainView : View() {
    override val root: VBox by fxml("/view/main_window.fxml")
    val imageView: ImageView by fxid()

    fun onLoadImageButtonClicked() {
        val fileChooser = FileChooser();
        val file = fileChooser.showOpenDialog(null)
        val image = Image(file.toURI().toString())
        imageView.fitWidth = image.width
        imageView.fitHeight = image.height
        imageView.image = image
    }
}