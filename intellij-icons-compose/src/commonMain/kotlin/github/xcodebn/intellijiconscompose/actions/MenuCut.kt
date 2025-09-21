package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MenuCut: ImageVector
    get() {
        if (_MenuCut != null) return _MenuCut!!

        _MenuCut = ImageVector.Builder(
            name = "MenuCut",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(7f, 5f)
                curveTo(6.69f, 4.78f, 6.77f, 4.41f, 6.77f, 4.02f)
                curveTo(6.77f, 2.54f, 5.58f, 1.35f, 4.11f, 1.35f)
                curveTo(2.63f, 1.35f, 1.44f, 2.54f, 1.44f, 4.02f)
                curveTo(1.44f, 5.49f, 2.63f, 6.68f, 4.11f, 6.68f)
                curveTo(4.50f, 6.68f, 4.87f, 6.60f, 5.20f, 6.44f)
                lineTo(7f, 8f)
                lineTo(5f, 10f)
                curveTo(4.87f, 9.43f, 4.50f, 9.35f, 4.11f, 9.35f)
                curveTo(2.63f, 9.35f, 1.44f, 10.54f, 1.44f, 12.01f)
                curveTo(1.44f, 13.49f, 2.63f, 14.68f, 4.11f, 14.68f)
                curveTo(5.58f, 14.68f, 6.77f, 13.49f, 6.77f, 12.01f)
                curveTo(6.77f, 11.62f, 6.69f, 11.25f, 6.53f, 10.92f)
                lineTo(8f, 9f)
                lineTo(13f, 14f)
                lineTo(15f, 14f)
                lineTo(15f, 13f)
                lineTo(7f, 5f)
                close()
                moveTo(4f, 5f)
                curveTo(3.37f, 5.34f, 2.77f, 4.74f, 2.77f, 4.00f)
                curveTo(2.77f, 3.26f, 3.37f, 2.67f, 4.11f, 2.67f)
                curveTo(4.84f, 2.67f, 5.44f, 3.26f, 5.44f, 4.00f)
                curveTo(5.44f, 4.74f, 4.84f, 5.34f, 4.11f, 5.34f)
                close()
                moveTo(4f, 13f)
                curveTo(3.37f, 13.34f, 2.77f, 12.74f, 2.77f, 12.00f)
                curveTo(2.77f, 11.26f, 3.37f, 10.67f, 4.11f, 10.67f)
                curveTo(4.84f, 10.67f, 5.44f, 11.26f, 5.44f, 12.00f)
                curveTo(5.44f, 12.74f, 4.84f, 13.34f, 4.11f, 13.34f)
                close()
                moveTo(8f, 8f)
                curveTo(7.92f, 8.34f, 7.77f, 8.19f, 7.77f, 8.00f)
                curveTo(7.77f, 7.82f, 7.92f, 7.67f, 8.10f, 7.67f)
                curveTo(8.29f, 7.67f, 8.44f, 7.82f, 8.44f, 8.00f)
                curveTo(8.44f, 8.19f, 8.29f, 8.34f, 8.10f, 8.34f)
                close()
                moveTo(13f, 2f)
                lineTo(9f, 6f)
                lineTo(10f, 7f)
                lineTo(15f, 3f)
                lineTo(15f, 2f)
                lineTo(13f, 2f)
                close()
            }
        }.build()

        return _MenuCut!!
    }

private var _MenuCut: ImageVector? = null

