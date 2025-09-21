package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LocateDark: ImageVector
    get() {
        if (_LocateDark != null) return _LocateDark!!

        _LocateDark = ImageVector.Builder(
            name = "LocateDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(8f, 15f)
                curveTo(4.13f, 15.00f, 1.00f, 11.87f, 1.00f, 8.00f)
                curveTo(1.00f, 4.13f, 4.13f, 1.00f, 8.00f, 1.00f)
                curveTo(11.87f, 1.00f, 15.00f, 4.13f, 15.00f, 8.00f)
                curveTo(15.00f, 11.87f, 11.87f, 15.00f, 8.00f, 15.00f)
                close()
                moveTo(8f, 14f)
                curveTo(11.04f, 13.50f, 13.50f, 11.04f, 13.50f, 8.00f)
                curveTo(13.50f, 4.96f, 11.04f, 2.50f, 8.00f, 2.50f)
                curveTo(4.96f, 2.50f, 2.50f, 4.96f, 2.50f, 8.00f)
                curveTo(2.50f, 11.04f, 4.96f, 13.50f, 8.00f, 13.50f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(8f, 15f)
                    curveTo(4.13f, 15.00f, 1.00f, 11.87f, 1.00f, 8.00f)
                    curveTo(1.00f, 4.13f, 4.13f, 1.00f, 8.00f, 1.00f)
                    curveTo(11.87f, 1.00f, 15.00f, 4.13f, 15.00f, 8.00f)
                    curveTo(15.00f, 11.87f, 11.87f, 15.00f, 8.00f, 15.00f)
                    close()
                    moveTo(8f, 14f)
                    curveTo(11.04f, 13.50f, 13.50f, 11.04f, 13.50f, 8.00f)
                    curveTo(13.50f, 4.96f, 11.04f, 2.50f, 8.00f, 2.50f)
                    curveTo(4.96f, 2.50f, 2.50f, 4.96f, 2.50f, 8.00f)
                    curveTo(2.50f, 11.04f, 4.96f, 13.50f, 8.00f, 13.50f)
                    close()
                }
            }
        }.build()

        return _LocateDark!!
    }

private var _LocateDark: ImageVector? = null

