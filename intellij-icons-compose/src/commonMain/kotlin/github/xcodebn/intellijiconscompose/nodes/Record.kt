package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Record: ImageVector
    get() {
        if (_Record != null) return _Record!!

        _Record = ImageVector.Builder(
            name = "Record",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF40B6E0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 8f)
                curveTo(15.00f, 11.87f, 11.87f, 15.00f, 8.00f, 15.00f)
                curveTo(4.13f, 15.00f, 1.00f, 11.87f, 1.00f, 8.00f)
                curveTo(1.00f, 4.13f, 4.13f, 1.00f, 8.00f, 1.00f)
                curveTo(11.87f, 1.00f, 15.00f, 4.13f, 15.00f, 8.00f)
            }
            path(
                fill = SolidColor(Color(0xFF231F20)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                curveTo(9.30f, 6.00f, 10.00f, 6.31f, 10.00f, 6.95f)
                curveTo(10.00f, 7.59f, 9.29f, 8.00f, 8.55f, 8.00f)
                horizontalLineTo(7f)
                close()
                moveTo(9f, 9f)
                curveTo(10.18f, 8.59f, 11.00f, 8.11f, 11.00f, 6.91f)
                curveTo(11.00f, 5.72f, 9.95f, 5.00f, 8.62f, 5.00f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                horizontalLineTo(8f)
                lineTo(10f, 11f)
                horizontalLineTo(11f)
                lineTo(9f, 9f)
                close()
            }
        }.build()

        return _Record!!
    }

private var _Record: ImageVector? = null

