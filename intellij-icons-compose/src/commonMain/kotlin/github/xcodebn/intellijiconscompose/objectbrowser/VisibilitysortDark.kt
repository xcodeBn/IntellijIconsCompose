package github.xcodebn.intellijiconscompose.objectbrowser

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VisibilitysortDark: ImageVector
    get() {
        if (_VisibilitysortDark != null) return _VisibilitysortDark!!

        _VisibilitysortDark = ImageVector.Builder(
            name = "VisibilitysortDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2f)
                curveTo(2.22f, 1.50f, 2.00f, 1.81f, 2.00f, 2.20f)
                lineTo(2f, 4f)
                curveTo(2.00f, 4.19f, 2.22f, 4.50f, 2.50f, 4.50f)
                curveTo(2.78f, 4.50f, 3.00f, 4.19f, 3.00f, 3.80f)
                lineTo(3f, 2f)
                curveTo(3.00f, 1.81f, 2.78f, 1.50f, 2.50f, 1.50f)
                close()
                moveTo(2f, 0f)
                curveTo(3.33f, 0.50f, 4.00f, 1.17f, 4.00f, 2.00f)
                lineTo(4f, 4f)
                curveTo(4.00f, 4.33f, 3.33f, 5.00f, 2.50f, 5.00f)
                curveTo(1.67f, 5.00f, 1.00f, 4.33f, 1.00f, 3.50f)
                lineTo(1f, 2f)
                curveTo(1.00f, 1.17f, 1.67f, 0.50f, 2.50f, 0.50f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2f)
                curveTo(1.45f, 1.50f, 1.00f, 1.81f, 1.00f, 2.20f)
                lineTo(1f, 4f)
                lineTo(3f, 4f)
                lineTo(3f, 2f)
                curveTo(3.00f, 1.81f, 2.55f, 1.50f, 2.00f, 1.50f)
                close()
                moveTo(4f, 4f)
                lineTo(0f, 4f)
                lineTo(0f, 2f)
                curveTo(0.00f, 1.17f, 0.90f, 0.50f, 2.00f, 0.50f)
                curveTo(3.10f, 0.50f, 4.00f, 1.17f, 4.00f, 2.00f)
                lineTo(4f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(5f, 10f)
                lineTo(9f, 14f)
                lineTo(1f, 14f)
                close()
            }
        }.build()

        return _VisibilitysortDark!!
    }

private var _VisibilitysortDark: ImageVector? = null

