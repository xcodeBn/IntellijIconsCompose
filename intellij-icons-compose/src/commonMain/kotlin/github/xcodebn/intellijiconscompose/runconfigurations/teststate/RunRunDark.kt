package github.xcodebn.intellijiconscompose.runconfigurations.teststate

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RunRunDark: ImageVector
    get() {
        if (_RunRunDark != null) return _RunRunDark!!

        _RunRunDark = ImageVector.Builder(
            name = "RunRunDark",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF499C54))
            ) {
                moveTo(5f, 9f)
                lineTo(8f, 6f)
                lineTo(5f, 3f)
                lineTo(5f, 1f)
                lineTo(11f, 6f)
                lineTo(5f, 11f)
                lineTo(5f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF499C54))
            ) {
                moveTo(1f, 1f)
                lineTo(7f, 6f)
                lineTo(1f, 11f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF499C54))
                ) {
                    moveTo(5f, 9f)
                    lineTo(8f, 6f)
                    lineTo(5f, 3f)
                    lineTo(5f, 1f)
                    lineTo(11f, 6f)
                    lineTo(5f, 11f)
                    lineTo(5f, 9f)
                    close()
                }
            }
        }.build()

        return _RunRunDark!!
    }

private var _RunRunDark: ImageVector? = null

