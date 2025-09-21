package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CwmcamoffDark: ImageVector
    get() {
        if (_CwmcamoffDark != null) return _CwmcamoffDark!!

        _CwmcamoffDark = ImageVector.Builder(
            name = "CwmcamoffDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFC75450)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 13f)
                lineTo(3f, 1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(8f)
                lineTo(12f, 9f)
                close()
                moveTo(4f, 10f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(1f)
                lineTo(9f, 10f)
                close()
                moveTo(12f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                lineTo(9f, 6f)
                horizontalLineToRelative(2f)
                verticalLineTo(7f)
                lineTo(12f, 9f)
                verticalLineTo(9f)
                lineTo(15f, 11f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _CwmcamoffDark!!
    }

private var _CwmcamoffDark: ImageVector? = null

