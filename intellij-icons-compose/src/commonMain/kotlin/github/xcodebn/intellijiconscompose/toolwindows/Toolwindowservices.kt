package github.xcodebn.intellijiconscompose.toolwindows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Toolwindowservices: ImageVector
    get() {
        if (_Toolwindowservices != null) return _Toolwindowservices!!

        _Toolwindowservices = ImageVector.Builder(
            name = "Toolwindowservices",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 6f)
                lineTo(10f, 12f)
                lineTo(3f, 12f)
                lineTo(0f, 6f)
                lineTo(3f, 1f)
                lineTo(10f, 1f)
                lineTo(13f, 6f)
                close()
                moveTo(4f, 3f)
                lineTo(4f, 10f)
                lineTo(10f, 6f)
                lineTo(4f, 3f)
                close()
            }
        }.build()

        return _Toolwindowservices!!
    }

private var _Toolwindowservices: ImageVector? = null

