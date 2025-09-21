package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Pintab: ImageVector
    get() {
        if (_Pintab != null) return _Pintab!!

        _Pintab = ImageVector.Builder(
            name = "Pintab",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 7f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                curveTo(6.00f, 7.33f, 5.33f, 8.00f, 4.50f, 8.00f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                lineTo(8f, 13f)
                lineTo(8f, 13f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                curveTo(10.67f, 8.00f, 10.00f, 7.33f, 10.00f, 6.50f)
                close()
            }
        }.build()

        return _Pintab!!
    }

private var _Pintab: ImageVector? = null

