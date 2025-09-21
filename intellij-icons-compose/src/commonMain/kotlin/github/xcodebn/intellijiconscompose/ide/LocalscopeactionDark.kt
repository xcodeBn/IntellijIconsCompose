package github.xcodebn.intellijiconscompose.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LocalscopeactionDark: ImageVector
    get() {
        if (_LocalscopeactionDark != null) return _LocalscopeactionDark!!

        _LocalscopeactionDark = ImageVector.Builder(
            name = "LocalscopeactionDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 8f)
                curveTo(15.00f, 11.87f, 11.87f, 15.00f, 8.00f, 15.00f)
                curveTo(4.13f, 15.00f, 1.00f, 11.87f, 1.00f, 8.00f)
                curveTo(1.00f, 4.13f, 4.13f, 1.00f, 8.00f, 1.00f)
                curveTo(11.87f, 1.00f, 15.00f, 4.13f, 15.00f, 8.00f)
                close()
                moveTo(13f, 8f)
                curveTo(12.90f, 10.71f, 10.71f, 12.90f, 8.00f, 12.90f)
                curveTo(5.29f, 12.90f, 3.10f, 10.71f, 3.10f, 8.00f)
                curveTo(3.10f, 5.29f, 5.29f, 3.10f, 8.00f, 3.10f)
                curveTo(10.71f, 3.10f, 12.90f, 5.29f, 12.90f, 8.00f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3592C4)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 10f)
                curveTo(9.38f, 10.50f, 10.50f, 9.38f, 10.50f, 8.00f)
                curveTo(10.50f, 6.62f, 9.38f, 5.50f, 8.00f, 5.50f)
                curveTo(6.62f, 5.50f, 5.50f, 6.62f, 5.50f, 8.00f)
                curveTo(5.50f, 9.38f, 6.62f, 10.50f, 8.00f, 10.50f)
                close()
            }
        }.build()

        return _LocalscopeactionDark!!
    }

private var _LocalscopeactionDark: ImageVector? = null

