package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ConsoleDark: ImageVector
    get() {
        if (_ConsoleDark != null) return _ConsoleDark!!

        _ConsoleDark = ImageVector.Builder(
            name = "ConsoleDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(7f, 8f)
                lineTo(5f, 10f)
                lineTo(6f, 11f)
                lineTo(10f, 8f)
                lineTo(10f, 8f)
                lineTo(10f, 8f)
                lineTo(6f, 5f)
                lineTo(5f, 6f)
                lineTo(7f, 8f)
                close()
                moveTo(2f, 3f)
                lineTo(14f, 3f)
                lineTo(14f, 13f)
                lineTo(2f, 13f)
                lineTo(2f, 3f)
                close()
            }
        }.build()

        return _ConsoleDark!!
    }

private var _ConsoleDark: ImageVector? = null

