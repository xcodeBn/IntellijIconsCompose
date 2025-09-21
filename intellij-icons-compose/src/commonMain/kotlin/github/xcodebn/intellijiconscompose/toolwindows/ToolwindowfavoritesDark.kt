package github.xcodebn.intellijiconscompose.toolwindows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ToolwindowfavoritesDark: ImageVector
    get() {
        if (_ToolwindowfavoritesDark != null) return _ToolwindowfavoritesDark!!

        _ToolwindowfavoritesDark = ImageVector.Builder(
            name = "ToolwindowfavoritesDark",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 10f)
                lineTo(2f, 12f)
                lineTo(4f, 8f)
                lineTo(0f, 5f)
                lineTo(5f, 4f)
                lineTo(6f, 0f)
                lineTo(8f, 4f)
                lineTo(13f, 5f)
                lineTo(9f, 8f)
                lineTo(11f, 12f)
                close()
            }
        }.build()

        return _ToolwindowfavoritesDark!!
    }

private var _ToolwindowfavoritesDark: ImageVector? = null

