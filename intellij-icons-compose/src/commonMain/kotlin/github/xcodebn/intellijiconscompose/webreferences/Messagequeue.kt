package github.xcodebn.intellijiconscompose.webreferences

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Messagequeue: ImageVector
    get() {
        if (_Messagequeue != null) return _Messagequeue!!

        _Messagequeue = ImageVector.Builder(
            name = "Messagequeue",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 6f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(1f)
                verticalLineTo(6f)
                close()
                moveTo(10f, 9f)
                verticalLineTo(7f)
                lineTo(6f, 10f)
                lineTo(2f, 7f)
                verticalLineTo(9f)
                lineTo(6f, 11f)
                lineTo(10f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 2f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                lineTo(6f, 5f)
                verticalLineTo(3f)
                lineTo(9f, 5f)
                horizontalLineTo(11f)
                lineTo(14f, 3f)
                verticalLineTo(5f)
                lineTo(12f, 6f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                verticalLineTo(2f)
                close()
            }
        }.build()

        return _Messagequeue!!
    }

private var _Messagequeue: ImageVector? = null

