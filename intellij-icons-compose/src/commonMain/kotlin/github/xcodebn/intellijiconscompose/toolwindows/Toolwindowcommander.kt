package github.xcodebn.intellijiconscompose.toolwindows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Toolwindowcommander: ImageVector
    get() {
        if (_Toolwindowcommander != null) return _Toolwindowcommander!!

        _Toolwindowcommander = ImageVector.Builder(
            name = "Toolwindowcommander",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(1f, 2f)
                lineTo(12f, 2f)
                lineTo(12f, 11f)
                lineTo(1f, 11f)
                lineTo(1f, 2f)
                close()
                moveTo(2f, 3f)
                lineTo(2f, 10f)
                lineTo(11f, 10f)
                lineTo(11f, 3f)
                lineTo(2f, 3f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(1f, 2f)
                    lineTo(12f, 2f)
                    lineTo(12f, 11f)
                    lineTo(1f, 11f)
                    lineTo(1f, 2f)
                    close()
                    moveTo(2f, 3f)
                    lineTo(2f, 10f)
                    lineTo(11f, 10f)
                    lineTo(11f, 3f)
                    lineTo(2f, 3f)
                    close()
                }
            }
        }.build()

        return _Toolwindowcommander!!
    }

private var _Toolwindowcommander: ImageVector? = null

