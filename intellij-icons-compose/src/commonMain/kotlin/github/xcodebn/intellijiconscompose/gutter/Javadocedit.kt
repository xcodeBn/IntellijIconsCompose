package github.xcodebn.intellijiconscompose.gutter

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Javadocedit: ImageVector
    get() {
        if (_Javadocedit != null) return _Javadocedit!!

        _Javadocedit = ImageVector.Builder(
            name = "Javadocedit",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 5f)
                lineTo(7f, 3f)
                lineTo(1f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                lineTo(9f, 5f)
                close()
                moveTo(11f, 3f)
                curveTo(11.09f, 3.25f, 11.09f, 2.59f, 10.85f, 2.34f)
                lineTo(10f, 1f)
                curveTo(9.45f, 0.94f, 8.79f, 0.94f, 8.54f, 1.19f)
                lineTo(7f, 2f)
                lineTo(10f, 5f)
                lineTo(11f, 3f)
                close()
            }
        }.build()

        return _Javadocedit!!
    }

private var _Javadocedit: ImageVector? = null

