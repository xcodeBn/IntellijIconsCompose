package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SyncpanelsDark: ImageVector
    get() {
        if (_SyncpanelsDark != null) return _SyncpanelsDark!!

        _SyncpanelsDark = ImageVector.Builder(
            name = "SyncpanelsDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(3f, 7f)
                lineTo(7f, 7f)
                close()
                moveTo(4f, 8f)
                lineTo(4f, 13f)
                close()
                moveTo(9f, 7f)
                lineTo(13f, 7f)
                close()
                moveTo(10f, 8f)
                lineTo(10f, 13f)
                close()
                moveTo(11f, 4f)
                curveTo(9.94f, 3.56f, 9.03f, 3.14f, 8.02f, 3.14f)
                lineTo(7f, 6f)
                curveTo(4.57f, 6.00f, 4.57f, 6.00f, 4.57f, 6.00f)
                lineTo(3f, 6f)
                curveTo(3.04f, 6.00f, 3.04f, 6.00f, 3.04f, 6.00f)
                lineTo(3f, 6f)
                curveTo(5.30f, 2.24f, 6.59f, 1.64f, 8.02f, 1.64f)
                lineTo(13f, 2f)
                curveTo(13.00f, 6.00f, 13.00f, 6.00f, 13.00f, 6.00f)
                lineTo(11f, 6f)
                curveTo(11.48f, 6.00f, 11.48f, 6.00f, 11.48f, 6.00f)
                lineTo(9f, 6f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(3f, 7f)
                    lineTo(7f, 7f)
                    close()
                    moveTo(4f, 8f)
                    lineTo(4f, 13f)
                    close()
                    moveTo(9f, 7f)
                    lineTo(13f, 7f)
                    close()
                    moveTo(10f, 8f)
                    lineTo(10f, 13f)
                    close()
                    moveTo(11f, 4f)
                    curveTo(9.94f, 3.56f, 9.03f, 3.14f, 8.02f, 3.14f)
                    lineTo(7f, 6f)
                    curveTo(4.57f, 6.00f, 4.57f, 6.00f, 4.57f, 6.00f)
                    lineTo(3f, 6f)
                    curveTo(3.04f, 6.00f, 3.04f, 6.00f, 3.04f, 6.00f)
                    lineTo(3f, 6f)
                    curveTo(5.30f, 2.24f, 6.59f, 1.64f, 8.02f, 1.64f)
                    lineTo(13f, 2f)
                    curveTo(13.00f, 6.00f, 13.00f, 6.00f, 13.00f, 6.00f)
                    lineTo(11f, 6f)
                    curveTo(11.48f, 6.00f, 11.48f, 6.00f, 11.48f, 6.00f)
                    lineTo(9f, 6f)
                    close()
                }
            }
        }.build()

        return _SyncpanelsDark!!
    }

private var _SyncpanelsDark: ImageVector? = null

