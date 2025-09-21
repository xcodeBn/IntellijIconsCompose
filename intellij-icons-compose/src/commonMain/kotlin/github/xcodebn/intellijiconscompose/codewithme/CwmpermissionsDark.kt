package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CwmpermissionsDark: ImageVector
    get() {
        if (_CwmpermissionsDark != null) return _CwmpermissionsDark!!

        _CwmpermissionsDark = ImageVector.Builder(
            name = "CwmpermissionsDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 7f)
                horizontalLineTo(9f)
                curveTo(8.41f, 5.28f, 6.86f, 4.00f, 5.00f, 4.00f)
                curveTo(2.79f, 4.00f, 1.00f, 5.79f, 1.00f, 8.00f)
                horizontalLineTo(12f)
                verticalLineToRelative(3f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineToRelative(1f)
                verticalLineTo(7f)
                close()
                moveTo(5f, 10f)
                curveTo(4.17f, 9.50f, 3.50f, 8.83f, 3.50f, 8.00f)
            }
        }.build()

        return _CwmpermissionsDark!!
    }

private var _CwmpermissionsDark: ImageVector? = null

