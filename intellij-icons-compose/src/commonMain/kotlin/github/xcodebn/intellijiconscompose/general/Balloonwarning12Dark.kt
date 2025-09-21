package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Balloonwarning12Dark: ImageVector
    get() {
        if (_Balloonwarning12Dark != null) return _Balloonwarning12Dark!!

        _Balloonwarning12Dark = ImageVector.Builder(
            name = "Balloonwarning12Dark",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF0A732)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 0f)
                lineTo(12f, 11f)
                lineTo(0f, 11f)
                lineTo(6f, 0f)
                close()
                moveTo(7f, 10f)
                lineTo(7f, 8f)
                lineTo(5f, 8f)
                lineTo(5f, 10f)
                lineTo(7f, 10f)
                close()
                moveTo(7f, 7f)
                lineTo(7f, 3f)
                lineTo(5f, 3f)
                lineTo(5f, 7f)
                lineTo(7f, 7f)
                close()
            }
        }.build()

        return _Balloonwarning12Dark!!
    }

private var _Balloonwarning12Dark: ImageVector? = null

