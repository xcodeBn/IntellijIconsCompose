package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Inlinecopy: ImageVector
    get() {
        if (_Inlinecopy != null) return _Inlinecopy!!

        _Inlinecopy = ImageVector.Builder(
            name = "Inlinecopy",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 1f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                verticalLineTo(3f)
                horizontalLineTo(11f)
                verticalLineTo(1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 4f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                close()
                moveTo(12f, 6f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                verticalLineTo(6f)
                close()
                moveTo(7f, 10f)
                horizontalLineTo(12f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                close()
                moveTo(12f, 8f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _Inlinecopy!!
    }

private var _Inlinecopy: ImageVector? = null

