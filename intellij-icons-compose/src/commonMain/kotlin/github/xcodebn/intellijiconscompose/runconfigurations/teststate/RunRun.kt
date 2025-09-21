package github.xcodebn.intellijiconscompose.runconfigurations.teststate

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RunRun: ImageVector
    get() {
        if (_RunRun != null) return _RunRun!!

        _RunRun = ImageVector.Builder(
            name = "RunRun",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF59A869))
            ) {
                moveTo(6f, 8f)
                lineTo(8f, 6f)
                lineTo(6f, 4f)
                lineTo(6f, 1f)
                lineTo(11f, 6f)
                lineTo(6f, 11f)
                lineTo(6f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF59A869))
            ) {
                moveTo(2f, 1f)
                lineTo(7f, 6f)
                lineTo(2f, 11f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF59A869))
                ) {
                    moveTo(6f, 8f)
                    lineTo(8f, 6f)
                    lineTo(6f, 4f)
                    lineTo(6f, 1f)
                    lineTo(11f, 6f)
                    lineTo(6f, 11f)
                    lineTo(6f, 8f)
                    close()
                }
            }
        }.build()

        return _RunRun!!
    }

private var _RunRun: ImageVector? = null

