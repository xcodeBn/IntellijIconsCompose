package github.xcodebn.intellijiconscompose.toolwindows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentationDark: ImageVector
    get() {
        if (_DocumentationDark != null) return _DocumentationDark!!

        _DocumentationDark = ImageVector.Builder(
            name = "DocumentationDark",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(10f, 9f)
                lineTo(10f, 1f)
                lineTo(4f, 1f)
                lineTo(4f, 0f)
                lineTo(11f, 0f)
                lineTo(11f, 9f)
                lineTo(10f, 9f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(10f, 9f)
                    lineTo(10f, 1f)
                    lineTo(4f, 1f)
                    lineTo(4f, 0f)
                    lineTo(11f, 0f)
                    lineTo(11f, 9f)
                    lineTo(10f, 9f)
                    close()
                }
            }
        }.build()

        return _DocumentationDark!!
    }

private var _DocumentationDark: ImageVector? = null

