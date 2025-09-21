package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Arrowleft: ImageVector
    get() {
        if (_Arrowleft != null) return _Arrowleft!!

        _Arrowleft = ImageVector.Builder(
            name = "Arrowleft",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 6f)
                lineTo(12f, 10f)
                lineTo(3f, 10f)
                close()
            }
        }.build()

        return _Arrowleft!!
    }

private var _Arrowleft: ImageVector? = null

