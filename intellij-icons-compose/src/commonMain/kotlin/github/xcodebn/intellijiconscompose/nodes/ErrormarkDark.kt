package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ErrormarkDark: ImageVector
    get() {
        if (_ErrormarkDark != null) return _ErrormarkDark!!

        _ErrormarkDark = ImageVector.Builder(
            name = "ErrormarkDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFE05555)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 12f)
                curveTo(16.00f, 14.43f, 14.43f, 16.00f, 12.50f, 16.00f)
                curveTo(10.57f, 16.00f, 9.00f, 14.43f, 9.00f, 12.50f)
                curveTo(9.00f, 10.57f, 10.57f, 9.00f, 12.50f, 9.00f)
                curveTo(14.43f, 9.00f, 16.00f, 10.57f, 16.00f, 12.50f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 14f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                close()
                moveTo(13f, 10f)
                verticalLineTo(13f)
                horizontalLineTo(12f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _ErrormarkDark!!
    }

private var _ErrormarkDark: ImageVector? = null

