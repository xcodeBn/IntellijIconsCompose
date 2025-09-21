package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Preservecase: ImageVector
    get() {
        if (_Preservecase != null) return _Preservecase!!

        _Preservecase = ImageVector.Builder(
            name = "Preservecase",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 1f)
                lineTo(10f, 4f)
                lineTo(7f, 6f)
                verticalLineTo(1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 5f)
                lineTo(7f, 13f)
                horizontalLineTo(5f)
                lineTo(5f, 11f)
                horizontalLineTo(3f)
                lineTo(3f, 13f)
                horizontalLineTo(1f)
                lineTo(3f, 5f)
                horizontalLineTo(5f)
                close()
                moveTo(4f, 6f)
                lineTo(3f, 10f)
                horizontalLineTo(5f)
                lineTo(4f, 6f)
                close()
                moveTo(13f, 5f)
                lineTo(15f, 13f)
                horizontalLineTo(13f)
                lineTo(13f, 11f)
                horizontalLineTo(11f)
                lineTo(11f, 13f)
                horizontalLineTo(9f)
                lineTo(11f, 5f)
                horizontalLineTo(13f)
                close()
                moveTo(12f, 6f)
                lineTo(11f, 10f)
                horizontalLineTo(13f)
                lineTo(12f, 6f)
                close()
                moveTo(12f, 6f)
                horizontalLineTo(12f)
                lineTo(12f, 6f)
                lineTo(12f, 6f)
                close()
            }
        }.build()

        return _Preservecase!!
    }

private var _Preservecase: ImageVector? = null

