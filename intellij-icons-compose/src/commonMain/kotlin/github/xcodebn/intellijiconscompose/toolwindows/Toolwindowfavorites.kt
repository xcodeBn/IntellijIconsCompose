package github.xcodebn.intellijiconscompose.toolwindows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Toolwindowfavorites: ImageVector
    get() {
        if (_Toolwindowfavorites != null) return _Toolwindowfavorites!!

        _Toolwindowfavorites = ImageVector.Builder(
            name = "Toolwindowfavorites",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
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

        return _Toolwindowfavorites!!
    }

private var _Toolwindowfavorites: ImageVector? = null

