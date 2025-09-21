package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Arrowdown: ImageVector
    get() {
        if (_Arrowdown != null) return _Arrowdown!!

        _Arrowdown = ImageVector.Builder(
            name = "Arrowdown",
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
                lineTo(12f, 11f)
                lineTo(4f, 11f)
                close()
            }
        }.build()

        return _Arrowdown!!
    }

private var _Arrowdown: ImageVector? = null

