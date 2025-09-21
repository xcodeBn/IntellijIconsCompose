package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PrettyprintDark: ImageVector
    get() {
        if (_PrettyprintDark != null) return _PrettyprintDark!!

        _PrettyprintDark = ImageVector.Builder(
            name = "PrettyprintDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 4f)
                curveTo(4.22f, 4.00f, 4.00f, 4.22f, 4.00f, 4.50f)
                verticalLineTo(12f)
                curveTo(4.00f, 11.78f, 4.22f, 12.00f, 4.50f, 12.00f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                curveTo(3.12f, 14.00f, 2.00f, 12.88f, 2.00f, 11.50f)
                verticalLineTo(9f)
                lineTo(1f, 9f)
                verticalLineTo(7f)
                lineTo(2f, 7f)
                verticalLineTo(4f)
                curveTo(2.00f, 3.12f, 3.12f, 2.00f, 4.50f, 2.00f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 12f)
                curveTo(11.78f, 12.00f, 12.00f, 11.78f, 12.00f, 11.50f)
                lineTo(12f, 4f)
                curveTo(12.00f, 4.22f, 11.78f, 4.00f, 11.50f, 4.00f)
                lineTo(10f, 4f)
                lineTo(10f, 2f)
                lineTo(12f, 2f)
                curveTo(12.88f, 2.00f, 14.00f, 3.12f, 14.00f, 4.50f)
                verticalLineTo(7f)
                lineTo(15f, 7f)
                lineTo(15f, 9f)
                lineTo(14f, 9f)
                lineTo(14f, 12f)
                curveTo(14.00f, 12.88f, 12.88f, 14.00f, 11.50f, 14.00f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _PrettyprintDark!!
    }

private var _PrettyprintDark: ImageVector? = null

