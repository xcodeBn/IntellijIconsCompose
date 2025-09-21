package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PackageIcon: ImageVector
    get() {
        if (_PackageIcon != null) return _PackageIcon!!

        _PackageIcon = ImageVector.Builder(
            name = "PackageIcon",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 10f)
                curveTo(4.90f, 10.50f, 4.00f, 9.60f, 4.00f, 8.50f)
                curveTo(4.00f, 7.39f, 4.89f, 6.50f, 6.00f, 6.50f)
                curveTo(7.10f, 6.50f, 8.00f, 7.39f, 8.00f, 8.50f)
                curveTo(8.00f, 9.60f, 7.10f, 10.50f, 6.00f, 10.50f)
                close()
                moveTo(8f, 4f)
                lineTo(7f, 3f)
                curveTo(6.30f, 2.32f, 5.53f, 2.00f, 4.98f, 2.00f)
                lineTo(1f, 2f)
                curveTo(1.02f, 2.00f, 1.00f, 2.02f, 1.00f, 2.05f)
                lineTo(1f, 13f)
                lineTo(15f, 13f)
                lineTo(15f, 4f)
                lineTo(8f, 4f)
                close()
            }
        }.build()

        return _PackageIcon!!
    }

private var _PackageIcon: ImageVector? = null

