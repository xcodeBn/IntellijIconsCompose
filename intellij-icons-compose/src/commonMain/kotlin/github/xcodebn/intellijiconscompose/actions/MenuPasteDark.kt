package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MenuPasteDark: ImageVector
    get() {
        if (_MenuPasteDark != null) return _MenuPasteDark!!

        _MenuPasteDark = ImageVector.Builder(
            name = "MenuPasteDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 1f)
                lineTo(3f, 0f)
                lineTo(7f, 0f)
                lineTo(7f, 1f)
                lineTo(10f, 1f)
                lineTo(10f, 13f)
                lineTo(0f, 13f)
                lineTo(0f, 1f)
                lineTo(3f, 1f)
                close()
                moveTo(4f, 1f)
                lineTo(4f, 2f)
                lineTo(6f, 2f)
                lineTo(6f, 1f)
                lineTo(4f, 1f)
                close()
                moveTo(2f, 4f)
                lineTo(2f, 11f)
                lineTo(8f, 11f)
                lineTo(8f, 4f)
                lineTo(2f, 4f)
                close()
            }
        }.build()

        return _MenuPasteDark!!
    }

private var _MenuPasteDark: ImageVector? = null

