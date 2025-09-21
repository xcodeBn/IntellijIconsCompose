package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CwminviteDark: ImageVector
    get() {
        if (_CwminviteDark != null) return _CwminviteDark!!

        _CwminviteDark = ImageVector.Builder(
            name = "CwminviteDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFB0B1B3))
            ) {
                moveTo(9f, 10f)
                lineTo(8f, 12f)
                curveTo(7.17f, 12.02f, 6.60f, 12.25f, 6.00f, 12.25f)
                lineTo(7f, 11f)
                lineTo(4f, 6f)
                curveTo(2.45f, 7.89f, 2.00f, 8.89f, 2.00f, 10.00f)
                curveTo(2.00f, 12.21f, 3.79f, 14.00f, 6.00f, 14.00f)
                lineTo(7f, 13f)
                lineTo(9f, 10f)
                close()
                moveTo(10f, 2f)
                curveTo(8.89f, 2.00f, 7.89f, 2.45f, 7.17f, 3.17f)
                lineTo(6f, 4f)
                lineTo(7f, 6f)
                curveTo(8.83f, 3.98f, 9.40f, 3.75f, 10.00f, 3.75f)
                curveTo(11.24f, 3.75f, 12.25f, 4.76f, 12.25f, 6.00f)
                lineTo(11f, 7f)
                curveTo(13.55f, 8.11f, 14.00f, 7.11f, 14.00f, 6.00f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB0B1B3))
            ) {
                moveTo(5f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _CwminviteDark!!
    }

private var _CwminviteDark: ImageVector? = null

