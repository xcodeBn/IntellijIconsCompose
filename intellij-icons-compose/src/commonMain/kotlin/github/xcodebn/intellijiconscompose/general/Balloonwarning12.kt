package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Balloonwarning12: ImageVector
    get() {
        if (_Balloonwarning12 != null) return _Balloonwarning12!!

        _Balloonwarning12 = ImageVector.Builder(
            name = "Balloonwarning12",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFEDA200)),
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

        return _Balloonwarning12!!
    }

private var _Balloonwarning12: ImageVector? = null

