import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.layout.StackPane
import javafx.stage.Stage

class SudokuApp extends Application:
  override def start(stage: Stage): Unit =
    val javaVersion = System.getProperty("java.version")
    val javafxVersion = System.getProperty("javafx.version")
    val l = new Label(s"Hello, JavaFX $javafxVersion, running on Java $javaVersion.")
    val scene = Scene(StackPane(l), 640, 480)
    stage.setScene(scene)
    stage.show()

object SudokuApp:
  def main(args: Array[String]): Unit =
    Application.launch(classOf[SudokuApp])