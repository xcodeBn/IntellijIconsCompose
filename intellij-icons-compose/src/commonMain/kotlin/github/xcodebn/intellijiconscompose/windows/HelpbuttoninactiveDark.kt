package github.xcodebn.intellijiconscompose.windows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HelpbuttoninactiveDark: ImageVector
    get() {
        if (_HelpbuttoninactiveDark != null) return _HelpbuttoninactiveDark!!

        _HelpbuttoninactiveDark = ImageVector.Builder(
            name = "HelpbuttoninactiveDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 0f)
                curveTo(0.00f, 0.00f, 0.00f, 2.91f, 0.00f, 3.00f)
                curveTo(0.67f, 3.00f, 1.00f, 3.00f, 1.00f, 3.00f)
                curveTo(1.00f, 3.00f, 1.00f, 1.00f, 3.00f, 1.00f)
                curveTo(4.16f, 1.00f, 5.00f, 1.74f, 5.00f, 3.00f)
                curveTo(5.00f, 5.29f, 2.00f, 4.06f, 2.00f, 8.00f)
                lineTo(3f, 8f)
                curveTo(3.00f, 4.62f, 6.00f, 6.00f, 6.00f, 3.00f)
                curveTo(6.00f, 1.58f, 5.00f, 0.00f, 3.00f, 0.00f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(3f, 0f)
                    curveTo(0.00f, 0.00f, 0.00f, 2.91f, 0.00f, 3.00f)
                    curveTo(0.67f, 3.00f, 1.00f, 3.00f, 1.00f, 3.00f)
                    curveTo(1.00f, 3.00f, 1.00f, 1.00f, 3.00f, 1.00f)
                    curveTo(4.16f, 1.00f, 5.00f, 1.74f, 5.00f, 3.00f)
                    curveTo(5.00f, 5.29f, 2.00f, 4.06f, 2.00f, 8.00f)
                    lineTo(3f, 8f)
                    curveTo(3.00f, 4.62f, 6.00f, 6.00f, 6.00f, 3.00f)
                    curveTo(6.00f, 1.58f, 5.00f, 0.00f, 3.00f, 0.00f)
                    close()
                }
            }
        }.build()

        return _HelpbuttoninactiveDark!!
    }

private var _HelpbuttoninactiveDark: ImageVector? = null

