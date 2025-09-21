package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Restartframe: ImageVector
    get() {
        if (_Restartframe != null) return _Restartframe!!

        _Restartframe = ImageVector.Builder(
            name = "Restartframe",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                close()
                moveTo(13f, 10f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF59A869)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 1f)
                lineTo(13f, 4f)
                lineTo(9f, 7f)
                verticalLineTo(1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF59A869)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 3f)
                horizontalLineTo(6f)
                curveTo(4.01f, 3.00f, 2.00f, 5.01f, 2.00f, 7.50f)
                curveTo(2.00f, 9.99f, 4.01f, 12.00f, 6.50f, 12.00f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                curveTo(5.12f, 10.00f, 4.00f, 8.88f, 4.00f, 7.50f)
                curveTo(4.00f, 6.12f, 5.12f, 5.00f, 6.50f, 5.00f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _Restartframe!!
    }

private var _Restartframe: ImageVector? = null

